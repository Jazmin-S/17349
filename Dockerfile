From alpine
Run apk add nginx
#Run nginx 
CMD ["nginx","-g","daemon off;"]
Expose 80
COPY ./ordinario-ftw /var/lib/nginx/html
COPY ./Jazmin.conf /etc/nginx/http.d/default.conf