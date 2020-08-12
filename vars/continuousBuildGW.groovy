def call (){

node{
  	     stage ('.....clean'){
		    steps{
			    echo "hello"
				}
			}
			stage('...test..'){
			steps{
			echo "hello"
			}
			}
			stage('...run deploy..'){
			 steps{
			echo "done"
				
			 }
			 }
	    stage('comment'){
		    steps{
 triggers {
        issueCommentTrigger('.*test this please.*')
	       }
		    }
	    }
			

	}
}
		
	
