package Generics;

public class ApiResponse<T>{
    private boolean success;
    private String message;
    private T data;


    public ApiResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }


    public void printResponse(){
        System.out.println("Success: " + success);
        System.out.println("Message: " + message);
        System.out.println("Data: " + data);
    }


    // Optional: override toString for clean logging
    @Override
    public String toString() {
        return "ApiResponse{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

}
