import axios from "axios";

const API_URL = "http://localhost:8080/api";

export const registerUser = (data) => axios.post(API_URL + "/register", data);

export const login = (data) => axios.post(API_URL + "/login", data);
