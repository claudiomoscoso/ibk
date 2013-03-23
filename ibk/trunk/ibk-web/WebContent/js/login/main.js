function onLoadPage() {
	//loadBankInfo();
}

function loadBankInfo() {
	var xhr = $.ajax({
		url : contextPath + "/servlet/login/LoadBankInfo",
		cache : false
	});

	xhr.done(function(html) {
		$("#bankInfo").append(html);
	});
}