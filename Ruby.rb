a = gets().chomp().to_i
b = 2
if a % 2 == 0
    for i in (1..12).step(2) do
      printf("%d\n", a + i);
    end
else
   for i in (0..10).step(2) do
     printf("%d\n", a + i);
   end
end
