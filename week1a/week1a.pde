println("backwards"+"  "+"forkwards"+"  "+"difference");
for(int x = 10; x <= 10000; x = x*10){
   float sum = 0;
   for(float n = 1; n < x; n++){
       sum = sum + 1/(n*n);
   }
   float sumback = 0;
   for(float n = x; n >= 1; n--){
       sumback = sumback + 1/(n*n);
   }
   println(sqrt(6*sum)+"  "+sqrt(6*sumback)+"  "+(sqrt(6*sumback)-sqrt(6*sum)));
}
exit();



  
  