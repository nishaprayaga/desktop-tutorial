#!/usr/bin/env groovy
node{
  	     stage ('.....clean'){
		    
			    echo "hello"
				
			}
			stage('...run deploy..'){
			 
			echo "done"
				
			 
			 }
	    stage('comment'){
           def comment = pullRequest.comment('This PR is highly illogical..')
          
		    comment.createReply('Khaaannnn!')
		    for (comment in pullRequest.comment) {
  echo "Author: ${comment.user}, Comment: ${comment.body}"
}

        
	       
		    	    }

}
