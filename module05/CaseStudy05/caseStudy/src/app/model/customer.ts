import {CustomerType} from './customerType';

export interface Customers {
  id: number;
  name: string;
  birthday: number;
  gender: string;
  card: number;
  phone: number;
  email: string;
  address: string;
  typeCustomer: CustomerType;
}

