		var Ajax = function() {
		}
		
		Ajax.prototype.getXmlHttpRequest = function() {
			var xmlhttp = false;
			
			try {
				xmlhttp = new XMLHttpRequest();
			} catch(e) {
				try {
					xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
				} catch(e) {
					try {
						xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
					} catch(e) {
						xmlhttp = null;
					}
				}
			}
			
			if (xmlhttp == null) {
				alert("XHR 객체를 생성하는데 실패하였습니다.");
			}
				
			return xmlhttp;
		}
		
		Ajax.prototype.callByAjax = function(url, callbackHandler) {
			try {
				var xmlhttp = this.getXmlHttpRequest();
				xmlhttp.open("GET", url , true);
				xmlhttp.onreadystatechange = function() {
					if (xmlhttp.readyState == 4) {
						if (xmlhttp.status == 200) {
							var data = xmlhttp.responseText;
							callbackHandler(data);
						} else {
							alert("Ajax request failed("+xmlhttp.status+")");
						}
					}
				}
				xmlhttp.send(null);
			} catch (e) {
				alert(e.message);
			}
			return false;
		}
		
		
		
		Ajax.prototype.callByAjaxXML = function(url, param, callbackHandler) {
			try {
				var xmlhttp = this.getXmlHttpRequest();
				xmlhttp.open("POST", url,  true);
				xmlhttp.onreadystatechange = function() {
					if (xmlhttp.readyState == 4) {
						if (xmlhttp.status == 200) {
							var data = xmlhttp.responseXML;
							callbackHandler(data);
						} else {
							alert("Ajax request failed("+xmlhttp.status+")");
						}
					}
				}
				
				xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
				xmlhttp.send(param);
			} catch (e) {
				alert(e.message);
			}
			return false;
		}
		
		Ajax.prototype.callByAjaxText = function(url, param, callbackHandler) {
			try {
				var xmlhttp = this.getXmlHttpRequest();
				xmlhttp.open("POST", url,  true);
				xmlhttp.onreadystatechange = function() {
					if (xmlhttp.readyState == 4) {
						if (xmlhttp.status == 200) {
							var data = xmlhttp.responseText;
							callbackHandler(data);
						} else {
							alert("Ajax request failed("+xmlhttp.status+")");
						}
					}
				}
				
				xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
				xmlhttp.send(param);
			} catch (e) {
				alert(e.message);
			}
			return false;
		}
		
		Ajax.prototype.callByAjaxWithId = function(url, callbackHandler, id) {
			try {
				var xmlhttp = this.getXmlHttpRequest();
				xmlhttp.open("GET", url , true);
				xmlhttp.onreadystatechange = function() {
					if (xmlhttp.readyState == 4) {
						if (xmlhttp.status == 200) {
							var data = xmlhttp.responseText;					
							callbackHandler(data, id);
						} else {
							alert("Ajax request failed("+xmlhttp.status+")");
						}
					}
				}
				xmlhttp.send(null);
			} catch (e) {
				alert(e.message);
			}
			return false;
		}
		
		Ajax.prototype.callByAjaxWithIdToPost = function(url, callbackHandler, id, params) {
			try {
				var xmlhttp = this.getXmlHttpRequest();			
				xmlhttp.onreadystatechange = function() {
					if (xmlhttp.readyState == 4) {
						if (xmlhttp.status == 200) {
							var data = xmlhttp.responseText;
							callbackHandler(data, id);
						} else {					
							alert("Ajax request failed("+xmlhttp.status+")");
						}
					}
				}
				xmlhttp.open("POST", url , true);
				xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
				xmlhttp.send(params);	
			} catch (e) {
				alert(e.message);
			}
			return false;
		}
