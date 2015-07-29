angular.module("mainModule", [])
  .controller("mainController", function ($scope, $http)
  {
    $scope.person1 = {};
    $scope.person2 = {};
    $scope.person3 = {};
	
	$scope.subjects = [{entityKey: 1001,discVersionKey:1001,entityMark:"Entitiy Mark-1",firstName: "Andrew",lastName: "Ramesh"},
					{entityKey: 1002,discVersionKey:1003,entityMark:"Entitiy Mark-2",firstName: "Jackson",lastName: "Kumar"},
					{entityKey: 1003,discVersionKey:1007,entityMark:"Entitiy Mark-3",firstName: "Gina",lastName: "Ali"}];
	
	$scope.transactions = [{amountBase: "INR",accountSourceRefId: 1232,currencyCodeBase: "INR",transRefDesc: "Sample-1",txnTypeDesc: "Sample-1 Txn Transaction"},
						  {amountBase: "GBP",accountSourceRefId: 5466,currencyCodeBase: "GBP",transRefDesc: "Sample-2",txnTypeDesc: "Sample-2 Txn Transaction"},
						  {amountBase: "USR",accountSourceRefId: 2121,currencyCodeBase: "USR",transRefDesc: "Sample-3",txnTypeDesc: "Sample-3 Txn Transaction"}];
	
    $scope.disclosure = {key: 1001,caseIdentifier: "C12321112",caseKey: 2543,caseName: "SAR QS",orgunitCode: 1001,domainCode: 1025, subjects:$scope.subjects, transactions:$scope.transactions};
	

	
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
	
	
	
	$scope.submitDisclosure = function (disclosure, resultVarName)
    {
	  alert("person -- "+disclosure);
	  alert("person -- "+JSON.stringify(disclosure));
//'{"key":1001,"caseIdentifier":"C12321112","caseKey":2543,"caseName":"SAR QS","orgunitCode":1001,"domainCode":1025}'

	var disclosureVar = new Object();
	disclosureVar['key']=1001;
	disclosureVar['caseIdentifier']='C12321112';
	disclosureVar['caseKey']=2543;
	disclosureVar['orgunitCode']=1004;
	disclosureVar['domainCode']=1025;
	

	var subjectsVar = [];
	
	var subjectVar1 = new Object();
	subjectVar1['entityKey'] = 1001;
	subjectVar1['discVersionKey'] = 1001;
	subjectVar1['entityMark'] = 'Entitiy Mark-1';
	subjectVar1['firstName'] = 'Andrew';
	subjectVar1['lastName'] = 'Ramesh';
	var subjectVar2 = new Object();
	subjectVar2['entityKey'] = 1002;
	subjectVar2['discVersionKey'] = 1003;
	subjectVar2['entityMark'] = 'Entitiy Mark-2';
	subjectVar2['firstName'] = 'Jackson';
	subjectVar2['lastName'] = 'Kumar';
	
	var subjectVar3 = new Object();
	subjectVar3['entityKey'] = 1003;
	subjectVar3['discVersionKey'] = 1005;
	subjectVar3['entityMark'] = 'Entitiy Mark-3';
	subjectVar3['firstName'] = 'Gina';
	subjectVar3['lastName'] = 'Ali';
	
	subjectsVar[0] = subjectVar1;
	subjectsVar[1] = subjectVar2;
	subjectsVar[2] = subjectVar3;
	
	disclosureVar['subjects']=subjectsVar;
	
	var transactionsVar = [];
	
	var transactionVar1 = new Object();
	transactionVar1['amountBase'] = 'INR';
	transactionVar1['accountSourceRefId'] = 1232;
	transactionVar1['currencyCodeBase'] = 'INR';
	transactionVar1['transRefDesc'] = 'Sample-1';
	transactionVar1['txnTypeDesc'] = 'Sample-1 Txn Transaction';
	
	var transactionVar2 = new Object();
	transactionVar2['amountBase'] = 'INR';
	transactionVar2['accountSourceRefId'] = 1235;
	transactionVar2['currencyCodeBase'] = 'INR';
	transactionVar2['transRefDesc'] = 'Sample-2';
	transactionVar2['txnTypeDesc'] = 'Sample-2 Txn Transaction';
	
	transactionsVar[0] = transactionVar1;
	transactionsVar[1] = transactionVar2;
	
	//amountBase: "INR",accountSourceRefId: 1232,currencyCodeBase: "INR",transRefDesc: "Sample-1",txnTypeDesc: "Sample-1 Txn Transaction"
	disclosureVar['transactions']=transactionsVar;

	alert("disclosureVar -- "+JSON.stringify(disclosureVar));


      $http.post("services/example/createDisclosure",JSON.stringify(disclosureVar))
        .success(function (data, status, headers, config)
        {
			alert("in Success");
          $scope[resultVarName] = data;
        })
        .error(function (data, status, headers, config)
        {
			alert("in Success");
          $scope[resultVarName] = "SUBMIT ERROR";
        });
    };
	
  });