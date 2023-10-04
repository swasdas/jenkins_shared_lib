def call(String ImgName, String ImgTag, String DockerHubUser){ 
    sh """
     docker rmi ${DockerHubUser}/${ImgName}:${ImgTag}
     docker rmi ${DockerHubUser}/${ImgName} 
    """
}
// ${DockerHubUser}/${ImgName}:latest
