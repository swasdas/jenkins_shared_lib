def call(String ImgName, String ImgTag, String DockerHubUser){
  sh """
    trivy image ${DockerHubUser}/${ImgName}:latest > scan.txt 
    //if you want image tag version:-  ${DockerHubUser}/${ImgName}:${ImgTag}
    cat scan.txt 
  """
}
