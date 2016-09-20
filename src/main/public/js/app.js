(function() {
	
	'use strict';
	
	angular.module('app.services', []);
    angular.module('app.controllers', []);
    angular.module('app.directives', []);

    var app = angular.module('app', ['app.services', 'app.controllers', 'app.directives',
        'ngRoute', 'ngCookies', 'ui.bootstrap.modal', 'ui.bootstrap.typeahead', 'ui.bootstrap.alert',
        'ui.bootstrap.tabs']);

    app.constant('BASE_API_ADDRESS', 'http://localhost:8080/api/');
})();