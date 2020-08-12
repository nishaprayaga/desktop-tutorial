#!/usr/bin/env groovy
node{
  	     stage ('.....clean'){
		    
			    echo "hello"
				
			}
			stage('...run deploy..'){
			 
			echo "done"
				
			 
			 }
	    stage('comment'){
		    
 triggers {
        issueCommentTrigger('.*test this please.*')
	       
		    }
	    }

}
