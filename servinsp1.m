num_of_rand_num = 200000;
mod_val = 33554432;
k = 10;
a = 3 + 8*k;
x = zeros(num_of_rand_num, 1);
rand = zeros(num_of_rand_num, 1);
x1 = 33554431;
new_mod = a*x(1);
rand(1) = x(1)/mod_val;
for i = 1 : num_of_rand_num
    if i == 1
        new_mod = a*x1;
        x(i+1) = mod(new_mod, mod_val);
    else
        new_mod = a*x(i);
        x(i+1) = mod(new_mod, mod_val);
        rand(i) = x(i)/mod_val;
    end
end
figure(1)
histogram(rand);
xlabel('Random Number Value')
ylabel('Frequency')
location = zeros(num_of_rand_num, 1);
lamda = 0.099;
for i = 1 : num_of_rand_num
    location(i) = (-1/lamda)*log(rand(i));
end
location(1) = 0;
loc_var = var(location);
loc_mean = mean(location);
figure(2)
histogram(location);
xlabel('Random Variate Value')
ylabel('Frequency')
title('servinsp1')