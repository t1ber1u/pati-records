(function () {

    'use strict';

    function appController($scope, $location) {

        $scope.location = $location;

        $scope.changeView = function(nextView) {

            $location.url(nextView);
        };
    }

    angular.module('app.controllers').controller('ApplicationController', appController);
})();