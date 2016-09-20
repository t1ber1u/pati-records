(function() {

    'use strict';

    function patientController($scope, $location, PatientService, AlertService) {

        $scope.patient = {
            name: undefined,
            phone: undefined,
            genderAdm: undefined,
            birthDate: undefined,
            address: undefined,
            maritalStatus: undefined,
            breed: undefined,
            ethnicGroup: undefined
        };

        registerComboBoxes($scope);

        $scope.save = function() {

            PatientService.addPatient($scope.patient)
                .then(function() {

                    AlertService.addSuccess('Paciente adicionado com sucesso');
                    $location.path('/');
                }, function(err) {

                    AlertService.addError(err.data);
                });
        };

        $scope.cancel = function() {

            $location.path('/');
        };
    }

    function registerComboBoxes(scope) {

        scope.gendersAdm = [
            {
                value: 'F',
                description: 'Feminino'
            },
            {
                value: 'M',
                description: 'Masculino'
            },
            {
                value: 'UN',
                description: 'Indiferenciado'
            }
        ];

        scope.maritalStatuses = [
            {
                value: 'A',
                description: 'Anulado'
            },
            {
                value: 'D',
                description: 'Divorciado'
            },
            {
                value: 'I',
                description: 'Interlocutório'
            },
            {
                value: 'L',
                description: 'Legalmente separado'
            },
            {
                value: 'M',
                description: 'Casado'
            },
            {
                value: 'P',
                description: 'Poligâmico'
            },
            {
                value: 'S',
                description: 'Nunca casado'
            },
            {
                value: 'T',
                description: 'União estável'
            },
            {
                value: 'W',
                description: 'Viúvo'
            }
        ];

        scope.ethnicGroups = [
            {
                value: '2158-4',
                description: 'Hondurenho'
            },
            {
                value: '2159-2',
                description: 'Nicaraguense'
            },
            {
                value: '2160-0',
                description: 'Panamenho'
            },
            {
                value: '2161-8',
                description: 'Salvadorenho'
            },
            {
                value: '2162-6',
                description: 'Índio centro-americano'
            },
            {
                value: '2666-0',
                description: 'Brasileiro'
            }
        ];

        scope.breeds = [
            {
                value: '2109-7',
                description: 'Armênio'
            },
            {
                value: '2110-5',
                description: 'Inglês'
            },
            {
                value: '2111-3',
                description: 'Francês'
            },
            {
                value: '2112-1',
                description: 'Alemão'
            },
            {
                value: '2113-9',
                description: 'Irlandês'
            },
            {
                value: '2114-7',
                description: 'Italiano'
            },
            {
                value: '2115-4',
                description: 'Polonês'
            },
            {
                value: '2116-2',
                description: 'Escocês'
            },
            {
                value: '2666-0',
                description: 'Brasilerio'
            }
        ];

    }

    angular.module('app.controllers').controller('PatientCtrl', patientController);
})();