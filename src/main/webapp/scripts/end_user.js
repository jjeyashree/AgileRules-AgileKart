/**
 * 
 */
var agileKart = angular.module('enduser',['ngRoute','ngResource']);
agileKart.config(function($routeProvider) {
			$routeProvider.when('/block/:blockvalue', {
				controller : 'popularctrl',
				templateUrl : 'views/end_user/blockpopular.html'
			}).when('/category/:categoryValue', {
				controller : 'CategoryCtrl',
				templateUrl : 'views/end_user/categoryPage.html'
			}).when('/product/:category/:productId', {
				controller : 'productCtrl',
				templateUrl : 'views/end_user/productPage.html'
			}).when('/summary', {
				controller : 'productCtrl',
				templateUrl : 'views/end_user/shoppingSummary.html'
			}).when('/summary/login', {
				controller : 'productCtrl',
				templateUrl : 'views/end_user/checkoutlogin.html'
			}).when('/summary/address', {
				controller : 'productCtrl',
				templateUrl : 'views/end_user/address.html'
			}).when('/summary/shopping', {
				controller : 'productCtrl',
				templateUrl : 'views/end_user/shopping.html'
			}).when('/summary/payment', {
				controller : 'productCtrl',
				templateUrl : 'views/end_user/payment.html'
			}).otherwise({
				redirectTo : '/block/blockpopular'
			});
		});
	agileKart.factory("DataService", function () {
	    
	    var myCart = new shoppingCart("AgileKart");
	    
	    myCart.addCheckoutParameters("PayPal", "jaugustin@agilerulesconsultants.com");

	    // enable Google Wallet checkout
	    // note: the second parameter identifies the merchant; in order to use the 
	    // shopping cart with Google Wallet, you have to create a merchant account with 
	    // Google. You can do that here:
	    // https://developers.google.com/commerce/wallet/digital/training/getting-started/merchant-setup
	    myCart.addCheckoutParameters("Google", "500640663394527",
	        {
	            ship_method_name_1: "UPS Next Day Air",
	            ship_method_price_1: "20.00",
	            ship_method_currency_1: "USD",
	            ship_method_name_2: "UPS Ground",
	            ship_method_price_2: "15.00",
	            ship_method_currency_2: "USD"
	        }
	    );

	    // return data object with store and cart
	    return {
	        cart: myCart
	    };
	});
		
		