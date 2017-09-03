
int year = 365*24*60*60;
int ageme = 23;
int age2 = 68;
long age3 = 69;
println(ageme*year);
println(age2*year);
println(age3*year);

int sum = 0;
for(int num = 1; num<=100; num++){
  sum = sum +num;
}
println(sum);

float sum2 = 0;
for(float num = 1; num<=100; num++){
  sum2 = sum2 + 1/num;
}
println(sum2);

float sum3 = 0;
for(float num = 100; num>=1; num--){
  sum3 = sum3 + 1/num;
}
println(sum3);

float sum4 = 0;
for(float num = 1; num<=sqrt(Float.MAX_VALUE); num++){
  sum4 = sum4 + 1/(num*num);
}
println(sum4);


  
  