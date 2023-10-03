def call(String ImgName, String ImgTag, String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
    sh "docker login -u '$USER' -p '$PASS'"
  }
  sh "docker image push ${DockerHubUser}/${ImgName}:${ImgTag}"
  sh "docker image push ${DockerHubUser}/${ImgName}:latest"
}
