def call(String ImgName, String ImgTag, String DockerHubUser){
  sh """
    trivy image ${DockerHubUser}/${ImgName}:latest > scan.txt 
    cat scan.txt 
  """
}
    
// find security vulnerabilities in your container images 
// so it acts as a vulnerability scanner 
// if you want tag / version for image:-  ${DockerHubUser}/${ImgName}:${ImgTag}
