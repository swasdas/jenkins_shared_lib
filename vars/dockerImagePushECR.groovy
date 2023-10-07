def call(String aws_id, String region, String ecr_repo){
  sh """
    aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_id}.dkr.ecr.${region}.amazonaws.com
    docker push ${aws_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repo}:latest 
  """
} 

// 89___56.dkr.ecr.ap-northeast-1.amazonaws.com
// aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_id}.dkr.ecr.${region}.amazonaws.com
// docker login --username AWS -p $(aws ecr get-login-password --region ${region}) ${aws_id}.dkr.ecr.${region}.amazonaws.com
