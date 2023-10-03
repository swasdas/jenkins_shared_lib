def call(){
  sh 'mvn clean install'
}

// Maven will clean the previous build's output by removing the target directory
// and then build & install project (compile project, run tests, package application into JAR or WAR file, 
// and then copy the packaged artifact into the local repository of your Maven setup)
