def call(String ImgName, String ImgTag, String DockerHubUser){ 
    sh """
     docker rmi ${DockerHubUser}/${ImgName}:${ImgTag}
     docker rmi ${DockerHubUser}/${ImgName}:latest
    """
}

// This command will remove the specified Docker images from your local system
