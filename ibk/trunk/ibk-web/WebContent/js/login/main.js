function onLoadPage() {
	loadBankInfo();
	loadUserInfo();
}

function loadBankInfo() {
	var xhr = $.ajax({
		url :  + "/servlet/main/LoadBankInfo",
		cache : false
	});

	xhr.done(function(html) {
		$("#bankInfo").html(html);
	});
}

function loadUserInfo() {
	var xhr = $.ajax({
		url : contextPath + "/servlet/main/LoadUserInfo",
		cache : false
	});

	xhr.done(function(html) {
		$("#userInfo").append(html);
	});
}