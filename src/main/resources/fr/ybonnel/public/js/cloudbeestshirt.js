

angular.module('cloudbeestshirt', []).config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/tshirt', {templateUrl:'partial/tshirt.html'});
    $routeProvider.otherwise({redirectTo: '/tshirt'});
}]);