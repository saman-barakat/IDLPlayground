## IDLPlayground

IDLPlayground is an online application developed to allow end users to explore the capabilities of IDL, IDL4OAS, and IDLReasoner web API. The Playground provides an editor specifically designed for IDL language.

### Overview

IDLPlayground offers a user-friendly interface that includes an IDL editor developed using [**Xtext**](https://www.eclipse.org/Xtext/), a popular framework for the development of programming languages and DSLs. The editor highlights the IDL syntax and provides real-time error detection of the IDL language.

The playground is integrated with the IDLReasoner web API, allowing users to analyze pre-configured API operations with IDL specifications without the need to install additional software. Access the application here: [**IDLPlayground**](http://idl.us.es/playground/)

### Features

- **IDL Editor**: Syntax highlighting and real-time error detection.
- **IDLReasoner web API Integration**: Analyze IDL specifications using the IDLReasoner web API.
- **Real-Time Feedback**: Immediate syntax error detection and analysis results.
- **User-Friendly Interface**: Easy-to-use interface for exploring IDL capabilities.

### How to Use

The IDLPlayground provides an intuitive interface for editing and evaluating IDL specifications. Follow these steps to use the application effectively:

1. **Select a Sample OAS**: From the combo box, choose a predefined sample OAS. For this example, select "Yelp Business".
2. **Choose an Operation**: Select the operation you want to analyze, such as "GET / Yelp Business Search". The editor will automatically import the corresponding IDL specification.
3. **Edit the IDL Specification**: Use the editor to make changes to the IDL specification. The editor features syntax highlighting and real-time error detection to help you quickly identify and correct any issues.
4. **Analyze the Specification**: Click the "Analyze" button to send the OAS and the IDL specification to the IDLReasoner web API for validation.
    - If the specification is valid, you will receive a success message.
    - If the specification is invalid, the web API will provide an explanation detailing the issues.

## License

This project is licensed under the [GPL-3.0 License](LICENSE). 

## Contact

For more information, visit the [IDL website](http://idl.us.es/).
