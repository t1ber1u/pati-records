(function() {
	
	'use strict';
	
	function patientService($http, BASE_API_ADDRESS) {
	
		return {

            getPatients: function () {

                return $http.get(BASE_API_ADDRESS + 'patient');
            },
            getById: function(id)  {

                return $http.get(BASE_API_ADDRESS + 'patient/' + id);
            },
            addPatient: function(patient) {

                return $http.post(BASE_API_ADDRESS + 'patient', patient);
            },
            addConsultation: function(patientId, consultation) {

                return $http.post(BASE_API_ADDRESS + 'patient/' + patientId + '/consultation', consultation);
            }
        }
	}
	
	angular.module('app.services').factory('PatientService', ['$http', 'BASE_API_ADDRESS', patientService]);
})();