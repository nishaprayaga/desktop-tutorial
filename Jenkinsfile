import org.jenkinsci.plugins.pipeline.modeldefinition.Utils


node{

 
    stage('Test') {
      
     
        
          echo "Current Pull Request ID: ${env.CHANGE_ID}"
        
      
    }
    stage('Test2') {
   
       
     
          pullRequest.comment("Your Pull request ${env.CHANGE_ID}  has been successful +artifact public id+link to it+the build is successful the version is not available to be deployed until it is merged back to the target branch and successfully built there")
        
     
    }
  
}
