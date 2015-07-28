angular.module("mainModule", [])
  .controller("mainController", function ($scope, $http)
  {
    $scope.person1 = {};
    $scope.person2 = {};
    $scope.person3 = {};

    $scope.submitData = function (person, resultVarName)
    {
	  alert("person -- "+person);
	  alert("person -- "+JSON.stringify(person));
      var config = {
        params: {
          //person: person
		  person
        }
      };

      $http.post("services/example/putModel",JSON.stringify(person))
        .success(function (data, status, headers, config)
        {
          $scope[resultVarName] = data;
        })
        .error(function (data, status, headers, config)
        {
          $scope[resultVarName] = "SUBMIT ERROR";
        });
    };
  });