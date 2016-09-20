(function() {

    'use strict';

    function consultationNewCtrl($scope, $routeParams, PatientService, AlertService, $location) {

        $scope.consultation = {
            mainComplaint: "",
            subjectiveComments: "",
            height: "",
            weight: "",
            temperature: "",
            diastolicPressure: "",
            systolicPressure: "",
            heartRate: "",
            glycemicLevel: "",
            respiratoryRate: "",
            oxigenLevel: "",
            carbonDioxideLevel: "",
            objectiveComments: "",
            analysisDiagnostic: "",
            analysisType: "",
            analysisComments: "",
            conduct: "",
            planComments: "",
            evolution: ""
        };

        $scope.patient = {
            name: undefined,
            genderAdm: undefined,
            birthDate: undefined,
            maritalStatus: undefined,
            breed: undefined,
            ethnicGroup: undefined
        };

        function load() {
            PatientService.getById($routeParams.idPatient)
                .then(function(patient) {

                    $scope.patient = angular.copy(patient.data);
                    $scope.patient.birthDate = new Date(patient.data.birthDate);
                }, function(err) {

                    AlertService.addError('Paciente não encontrado.');
                });
        }

        load();

        $scope.save = function() {

            PatientService.addConsultation($routeParams.idPatient, $scope.consultation)
                .then(function(res) {

                    AlertService.addSuccess('Consulta salva com sucesso.');
                    $location.path('/');
                }, function(err) {

                    console.log(err);
                });
        };

        $scope.gendersAdm = {
            'F': 'Feminino',
            'M': 'Masculino',
            'UN': 'Indiferenciado'
        };

        $scope.types = {
            analysisType : [
                {
                    value: 'D',
                    description: 'Definitivo'
                },
                {
                    value: 'H',
                    description: 'Hipótese'
                }
            ],
            analysisDiagnostic : [
                {
                    "value": "A00-B99",
                    "description": "Algumas doenças infecciosas e parasitárias."
                },
                {
                    "value": "C00-D48",
                    "description": "Neoplasmas (tumores)."
                },
                {
                    "value": "D50-D89",
                    "description": "Doenças do sangue e dos órgãos hematopoéticos e alguns transtornos imunitários."
                },
                {
                    "value": "E00-E90",
                    "description": "Doenças endócrinas, nutricionais e metabólicas."
                },
                {
                    "value": "F00-F99",
                    "description": "Transtornos mentais e comportamentais."
                },
                {
                    "value": "G00-G99",
                    "description": "Doenças do sistema nervoso."
                },
                {
                    "value": "H00-H59",
                    "description": "Doenças do olho e anexos."
                },
                {
                    "value": "H60-H95",
                    "description": "Doenças do ouvido e da apófise mastoide."
                },
                {
                    "value": "I00-I99",
                    "description": "Doenças do aparelho circulatório."
                },
                {
                    "value": "J00-J99",
                    "description": "Doenças do aparelho respiratório."
                },
                {
                    "value": "K00-K93",
                    "description": "Doenças do aparelho digestivo."
                },
                {
                    "value": "L00-L99",
                    "description": "Doenças da pele e do tecido subcutâneo."
                },
                {
                    "value": "M00-M99",
                    "description": "Doenças do sistema osteomuscular e do tecido conjuntivo."
                },
                {
                    "value": "N00-N99",
                    "description": "Doenças do aparelho geniturinário."
                },
                {
                    "value": "O00-O99",
                    "description": "Gravidez, parto e puerpério."
                },
                {
                    "value": "P00-P96",
                    "description": "Algumas afecções originadas no período perinatal."
                },
                {
                    "value": "Q00-Q99",
                    "description": "Malformações congênitas, deformidades e anomalias cromossômicas."
                },
                {
                    "value": "R00-R99",
                    "description": "Sintomas, sinais e achados anormais de exames clínicos e de laboratório, não classificados em outra parte"
                },
                {
                    "value": "S00-T98",
                    "description": "Lesões, envenenamentos e algumas outras conseqüências de causas externas."
                },
                {
                    "value": "V01-Y98",
                    "description": "Causas externas de morbidade e de mortalidade."
                },
                {
                    "value": "Z00-Z99",
                    "description": "Fatores que influenciam o estado de saúde e o contato com os serviços de saúde."
                },
                {
                    "value": "U00-U99",
                    "description": "Códigos para propósitos especiais."
                }
            ]
        };


    }

    angular.module('app.controllers').controller('ConsultationNewCtrl', consultationNewCtrl)
})();