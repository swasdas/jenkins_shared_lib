def call(String ImgName, String DockerHubUser){
  sh """
    trivy image ${DockerHubUser}/${ImgName}:latest > scan.txt 
    cat scan.txt 
  """
}
