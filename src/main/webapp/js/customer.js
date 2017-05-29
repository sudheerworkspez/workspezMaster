$(document).ready(function() {
	$("#dialog").dialog({
		modal : true,
		autoOpen : false,
		title : "jQuery Dialog",
		width : 1200,
		height : 550

	});
	$("#customer-pop").click(function() {
		$('#dialog').dialog('open');
	});
});