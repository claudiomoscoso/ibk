function onLoadPage() {
	loadBankInfo();
	loadUserInfo();
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

function loadUserInfo() {
	var xhr = $.ajax({
		url : contextPath + "/servlet/login/LoadUserInfo",
		cache : false
	});

	xhr.done(function(html) {
		$("#userInfo").append(html);
	});
}