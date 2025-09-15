FROM node:18.20-alpine

WORKDIR /app

COPY . .

RUN npm install

ENV PORT=3000

EXPOSE $PORT

ENTRYPOINT ["node", "app.js"]