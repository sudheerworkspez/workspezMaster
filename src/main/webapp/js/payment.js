$(document).ready(function(){
        $("#dialog").dialog({
            modal: true,
            autoOpen: false,
            title: "Payment",
            width: 300,
            height: 100,
            
        });
        $("#btnShow").click(function () {
            $('#dialog').dialog('open');
        });
    });



/*$('#myModal').on('shown.bs.modal', function() {
	$('#myInput').focus()
})*/

/*
 * $('#exampleModal').on('show.bs.modal', function(event) { var button =
 * $(event.relatedTarget) // Button that triggered the modal var recipient =
 * button.data('whatever') // Extract info from data-* // attributes // If
 * necessary, you could initiate an AJAX request here (and then do the //
 * updating in a callback). // Update the modal's content. We'll use jQuery
 * here, but you could use a // data binding library or other methods instead.
 * var modal = $(this) modal.find('.modal-title').text('New message to ' +
 * recipient) modal.find('.modal-body input').val(recipient) })
 */

/*
 * $(function() { $('#popup').gb().show(); })
 */

/*
 * $(function() { $("#dialog").dialog({ modal : true, autoOpen : false, title :
 * "jQuery Dialog", width : 300, height : 150 }); $("#btnShow").click(function() {
 * $('#dialog').dialog('open'); }); });
 */

/*
 * function openNav() { document.getElementById('nav').style.width = "100%"; }
 * function closeNav() { document.getElementById('nav').style.width = "0%"; }
 */