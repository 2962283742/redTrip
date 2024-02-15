import { request } from '@/request/index.js'

export const getBaseInfo = () => {
	return request(`/user/info`, 'GET')
}


export const userLogin = (user) => {
	return request('/user/login','POST',user)
}