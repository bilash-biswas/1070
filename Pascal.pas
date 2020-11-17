var
X,a:int64;
i:integer;
begin
   read(X);
   if((X mod 2) = 0)then
   begin
      a := 1;
      for i := 1 to 6 do
      begin
         writeln(X + a);
      a := a + 2;
      end
   end
   else
   begin
      a := 0;
      for i := 2 to 7 do
      begin
         writeln(X + a);
      a := a + 2;
      end
   end
end.
