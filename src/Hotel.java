import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    // List lưu danh sách khách hàng;
    List<Customer> listCus = new ArrayList<>();

    // Nhập thông tin khách hàng từ hệ thống bàn phím;
    Scanner sc = new Scanner(System.in);

    // Hàm nhập thông tin khách hàng;
    public void inputCustomerInfo() {
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();

        System.out.println("Enter the BirtDay: ");
        String birtDay = sc.nextLine();

        System.out.println("Enter the Identity: ");
        String identity = sc.nextLine();

        System.out.println("Enter the Day to Rent: ");
        int dayToRent = sc.nextInt();

        System.out.println("Enter the TypeRoom: ");
        String typeRoom = sc.nextLine();

        System.out.println("Enter the PriceRoom: ");
        double priceRoom = sc.nextDouble();

        sc.close();

        // Truyền đối số là thông tin của khách hàng và thêm vào List;
        Customer cusInfo = new Customer(name, birtDay, identity, dayToRent, typeRoom, priceRoom);
        listCus.add(cusInfo);
    }

    // Hàm hiển thị thông tin cuae khách hàng (truyền tên của khách hàng là đối số cần tìm);
    public void showCustomerInfo(Customer customer) {
        String customerInfo = "Full Name: " + customer.getName();
        customerInfo += "\nBirtDay: " + customer.getBirtDay();
        customerInfo += "\nIdentity: " + customer.getIdentity();
        customerInfo += "\nDayToRent: " + customer.getDayToRent();
        customerInfo += "\nTypeRoom " + customer.getTypeRoom();
        customerInfo += "\nPriceRoom: " + customer.getPriceRoom();

        System.out.println(customerInfo);
    }

    // Hàm thêm số lượng nhiều khách hàng;
    public void addCustomer(int n) {
        for (int i = 0; i < n; i++) {
            inputCustomerInfo();
        }
    }

    // Hàm xoá thông tin khi khách trả phòng;
    public void deleteCustomer(Customer customer) {
        listCus.remove(customer);
    }

    // Hàm hiển thị tất cả danh sách khách hàng hiện có trong list;
    public void showListCustomer() {
        for (int i = 0; i < listCus.size(); i++) {
            showCustomerInfo(listCus.get(i));
        }
    }

    // Hàm tìm kiếm khách hàng theo số CMTND (truyền vào đối số là số CMTND của khách hàng);
    public int findCusById(String identity) {
        int index = -1;
        for (int i = 0; i < listCus.size(); i++) {
            if (listCus.get(i).getIdentity().equals(identity)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // Hàm tính tiền khách CheckOut (truyền vào số CMTD của khách hàng);
    public double totalMoney(String identity) {
        int index = findCusById(identity);

        // Check điều kiện nếu ko tìm thấy thì hiển thị thông báo;
        if (index == -1) {
            return 0;
        } else {
            double totalMoney = listCus.get(index).getDayToRent() * listCus.get(index).getPriceRoom();
            return totalMoney;
        }
    }
}
