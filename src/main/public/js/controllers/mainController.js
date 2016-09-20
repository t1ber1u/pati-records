(function() {
	
	'use strict';
	
	function mainController($scope, $location, PatientService) {
		
		$scope.patients = [];
		
		PatientService.getPatients()
			.then(function(patients) {
				
				$scope.patients = patients.data;
			}, 
			function(err) {
				
				console.log(err);
			});

		$scope.openConsultation = function(index) {

			$location.url("/consultation/new/" + $scope.patients[index].id);
		}
	}
	
	angular.module('app.controllers').controller('MainController', mainController);
})();