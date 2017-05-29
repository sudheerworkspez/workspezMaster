package com.workspez.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.workspez.model.Customer;
import com.workspez.model.Vendor;
//import com.workspez.model.Vendor;
import com.workspez.service.CustomerService;
//import com.workspez.service.VendorService;
import com.workspez.service.VendorService;

@Controller
public class LayOutController {
	// Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CustomerService customerService;

//	@Autowired
//	private VendorService vendorService;

	@RequestMapping(value ="/", method = RequestMethod.GET)
	public ModelAndView layout(Model model) {
		System.out.println("we are in GET");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("layout");
		model.addAttribute("customer", new Customer());
		/* model.addAttribute("vendor", new Vendor()); */
		return modelAndView;
	}

	@RequestMapping(value = "/layout", method = RequestMethod.POST)
	public ModelAndView createNewCustomer(@Valid Customer customer, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		Customer customerExists = customerService.findCustomerName(customer.getCustCutomerName());
		if (customerExists != null) {
			bindingResult.rejectValue("customer", "error.customer",
					"There is already a customer registered with the name provided");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("layout");
		} else {
			customerService.saveCustomer(customer);
			modelAndView.addObject("successMessage", "Customer information saved successfully");
			modelAndView.addObject("customer", new Customer());
			modelAndView.setViewName("layout");

		}
		return modelAndView;

	}

	/*@RequestMapping(value = "/layout", method = RequestMethod.POST)
	public ModelAndView createNewVendor(@Valid Vendor vendor, BindingResult bindingResult) {
		System.out.println("we are in vendor popup");
		ModelAndView modelAndView = new ModelAndView();
		Vendor vendorExists = vendorService.findCompName(vendor.getVendCompanyName());
		if (vendorExists != null) {
			bindingResult.rejectValue("vendor", "error.vendor",
					"There is already a vendor registered with the name provided");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("layout");
		} else {
			vendorService.saveVendor(vendor);
			modelAndView.addObject("successMessage", "vendor information saved successfully");
			modelAndView.addObject("vendor", new Vendor());
			modelAndView.setViewName("layout");

		}
		return modelAndView;

	}*/

	/*
	 * @RequestMapping(value = "/customer", method = RequestMethod.POST) public
	 * String customerSubmit(@ModelAttribute Customer customer, Model model) {
	 * System.out.println("we are in controller one");
	 * model.addAttribute("customer", customer); String info = String.
	 * format("Customer Submission: id = %d, firstname = %s, lastname = %s",
	 * customer.getId(), customer.getFirstname(), customer.getLastname()); //
	 * log.info(info);
	 * 
	 * return "result"; }
	 */

	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET) public String
	 * displayLogin(Model model) { model.addAttribute("customer", new
	 * Customer()); return "customer"; }
	 */
	/*
	 * @RequestMapping(value = { "/", "/example" }, method = RequestMethod.GET)
	 * public ModelAndView customer() { ModelAndView modelAndView = new
	 * ModelAndView(); modelAndView.setViewName("example"); return modelAndView;
	 * }
	 */
}
