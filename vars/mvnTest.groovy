def call(){
  sh 'mvn -v'
  sh 'mvn test'
}  
  // this command will run the tests for a Java project
  // Maven will compile your project in source code (src/main) or test code (src/test) directory
  // and then run the tests found in the project's src/test directory
  // After running the tests, it generate reports and output the results to the console
