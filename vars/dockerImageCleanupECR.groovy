def call(String aws_id, String region, String ecr_repo){
  sh """
    docker rmi ${ecr_repo}:latest ${aws_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repo}:latest 
  """
} 
// 96___34.dkr.ecr.ap-northeast-1.amazonaws.com
