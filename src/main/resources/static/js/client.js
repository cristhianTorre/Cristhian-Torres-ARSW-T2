api = (function(){
return {
getClases: function(callback){
var promiseGetAllCases = $.getJSON("https://cristhian-torres-arsw-t2.herokuapp.com/cases");
$.when (promiseGetAllCases).done(function(data){
callback(data);});},

getCasesByCountry: function(country, callback){
var promiseGetCasesByCountry = $.getJSON("https://cristhian-torres-arsw-t2.herokuapp.com/cases/"+country);
$.when (promiseGetCasesByCountry).done(function(data){
callback(data);
});
}}})();