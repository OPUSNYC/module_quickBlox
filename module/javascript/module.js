// Expose the native API to javascript
forge.quickblox = {
    showAlert: function (text, success, error) {
        forge.internal.call('quickblox.showAlert', {text: text}, success, error);
    }
};

// Register for our native event
// forge.internal.addEventListener("quickblox.resume", function () {
// 	alert("Welcome back!");
// });
