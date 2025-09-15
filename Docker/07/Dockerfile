FROM node:18.20-alpine

WORKDIR /app

COPY package*.json ./

RUN npm install \
    && nom cache clean --force \
    && rm -rf /tmp/* /roor/.npm/_cacache

COPY . .

ENV PORT=3000

EXPOSE $PORT

CMD ["node", "src/app.js"]