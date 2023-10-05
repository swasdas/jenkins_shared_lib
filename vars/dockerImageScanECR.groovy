def call(String aws_id, String region, String ecr_repo){
  sh """
    trivy image ${aws_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repo}:latest > scan.txt
    cat scan.txt
  """
} 
// 89___56.dkr.ecr.ap-northeast-1.amazonaws.com
