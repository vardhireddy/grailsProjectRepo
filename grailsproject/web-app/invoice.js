angular.module('invoice2', ['finance2'])
.controller('InvoiceController', ['$scope','currencyConverter', function($scope,currencyConverter) {
  $scope.qty = 1;
  $scope.cost = 2;
  $scope.inCurr = 'EUR';
  $scope.currencies = currencyConverter.currencies;

  $scope.total = function total(outCurr) {
    return currencyConverter.convert(this.qty * this.cost, this.inCurr, outCurr);
  };
  $scope.pay = function pay() {
    window.alert("Thanks!");
  };
}]);