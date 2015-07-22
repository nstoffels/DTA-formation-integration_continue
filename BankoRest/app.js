angular.module("app", ["ngRoute"])

.config(function ($routeProvider) {

    $routeProvider

    .when("/", {
      templateUrl: "/home.html",
      controller: "IHMController",
      controllerAs: "ihmCtrl"
    })


    .when("/Affiche/:id", {
      templateUrl: "/prepare.html",
      controller: "PrepareController",
      controllerAs: "prepareCtrl"
    })


    .otherwise({
      redirectTo: "/"
    });

})

.controller("main", function ($scope) {
  $scope.bonjour = function () {
    console.log("Bonjour")
  }

})