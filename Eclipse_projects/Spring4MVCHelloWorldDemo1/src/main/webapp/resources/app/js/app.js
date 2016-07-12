'use strict';

var app = angular.module("myApp", []);
app.controller('MainController', ['$scope', function($scope) { 
	$scope.name = "Irfan";
	$scope.num1 = 0; 
	$scope.num2 = 0;
	$scope.num3 = 0;
	$scope.num4 = 0;
	$scope.num5 = 0;
	$scope.num6 = 0;
}]);



/*app.config(function($routeProvider) {
    $routeProvider

        .when('/', {
            templateUrl : 'pages/home.html',
            controller  : 'HomeController'
        })

        .when('/project', {
            templateUrl : 'pages/project.html',
            controller  : 'ProjectController'
        })


        .otherwise({redirectTo: '/'});

});

app.controller('HomeController', function($scope) {

    $scope.imageUrl = 'app/image/no_image.jpg';
    $scope.name = 'Irfan Ali';
    $scope.about = 'Jag gjorde min Mästare i Datavatenskap från Uppsala universitet. Jag har arbetat inom mjukvaruutveckling industrin för mer än fem år. Mina huvudsakliga arbets ares är PHP, MySQL, HTML, CSS, JavaScript. Jag har också arbetat med Java, .NET, Oracle, Elasticsearch, och vissa JavaScript-ramverk som Backbone och kantig.';
    $scope.mobile = '123-456 789';
    $scope.email = 'smartirfan@gmail.com';
    $scope.linkedin = 'https://linkedin.com/';
    $scope.institute = [
        {name:'Uppsala Universitet',year:'2010 2012', specialization: 'Datavatenskap'},
        {name:'Arid Universitet',year:'2003 2005', specialization: 'Datavatenskap'}
    ];
    $scope.projects = [
        {name:'Söksida med PHP och MySQL',link:'http://www.smartirfan.esy.es/search/', download_detail:'./app/pdf/book_search.rtf', code:'./app/zip/Search.zip'},
        {name:'Bootstrap slider och meny',link:'http://www.smartirfan.esy.es/bootstrap/', download_detail:'./app/pdf/bootstrap.rtf', code:'./app/zip/bootstrap.zip'},
        {name:'Mitt CV',link:'http://www.smartirfan.esy.es/cv/', download_detail:'./app/pdf/my_cv.rtf', code:'./app/zip/my_cv.zip'}
    ];
    $scope.orderByMe = function(x) {
        /!*function that is called when you click to sort*!/
        $scope.myOrderBy = x;
    }
});*/



