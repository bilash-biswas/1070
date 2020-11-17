a = io.read("*n")
for i = a,a+10,2 do
    if i % 2 == 0 then
        print(i + 1)
    else
        print(i)
    end
end
