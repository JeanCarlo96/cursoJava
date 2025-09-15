FROM nginx:alpine

WORKDIR /usr/share/nginx/html

COPY index.html .

COPY css.zip .

RUN unzip css.zip && rm css.zip

EXPOSE 80