def call(){
  sh 'mvn verify -DskipUnitTests'
}

// execute integration tests (in src/it directory) means testing interactions between different components or systems
// and skip running unit tests (in the src/test directory) during the build process 
