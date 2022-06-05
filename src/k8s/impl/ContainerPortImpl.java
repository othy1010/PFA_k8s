/**
 */
package k8s.impl;

import k8s.ContainerPort;
import k8s.K8sPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.ContainerPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link k8s.impl.ContainerPortImpl#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link k8s.impl.ContainerPortImpl#getContainerPort <em>Container Port</em>}</li>
 *   <li>{@link k8s.impl.ContainerPortImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerPortImpl extends MinimalEObjectImpl.Container implements ContainerPort {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected static final int HOST_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected int hostPort = HOST_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerPort() <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPort()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerPort() <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPort()
	 * @generated
	 * @ordered
	 */
	protected String containerPort = CONTAINER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final int PROTOCOL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected int protocol = PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.CONTAINER_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINER_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHostPort() {
		return hostPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPort(int newHostPort) {
		int oldHostPort = hostPort;
		hostPort = newHostPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINER_PORT__HOST_PORT, oldHostPort, hostPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainerPort() {
		return containerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerPort(String newContainerPort) {
		String oldContainerPort = containerPort;
		containerPort = newContainerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINER_PORT__CONTAINER_PORT, oldContainerPort, containerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(int newProtocol) {
		int oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINER_PORT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.CONTAINER_PORT__NAME:
				return getName();
			case K8sPackage.CONTAINER_PORT__HOST_PORT:
				return getHostPort();
			case K8sPackage.CONTAINER_PORT__CONTAINER_PORT:
				return getContainerPort();
			case K8sPackage.CONTAINER_PORT__PROTOCOL:
				return getProtocol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.CONTAINER_PORT__NAME:
				setName((String)newValue);
				return;
			case K8sPackage.CONTAINER_PORT__HOST_PORT:
				setHostPort((Integer)newValue);
				return;
			case K8sPackage.CONTAINER_PORT__CONTAINER_PORT:
				setContainerPort((String)newValue);
				return;
			case K8sPackage.CONTAINER_PORT__PROTOCOL:
				setProtocol((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case K8sPackage.CONTAINER_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case K8sPackage.CONTAINER_PORT__HOST_PORT:
				setHostPort(HOST_PORT_EDEFAULT);
				return;
			case K8sPackage.CONTAINER_PORT__CONTAINER_PORT:
				setContainerPort(CONTAINER_PORT_EDEFAULT);
				return;
			case K8sPackage.CONTAINER_PORT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case K8sPackage.CONTAINER_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case K8sPackage.CONTAINER_PORT__HOST_PORT:
				return hostPort != HOST_PORT_EDEFAULT;
			case K8sPackage.CONTAINER_PORT__CONTAINER_PORT:
				return CONTAINER_PORT_EDEFAULT == null ? containerPort != null : !CONTAINER_PORT_EDEFAULT.equals(containerPort);
			case K8sPackage.CONTAINER_PORT__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", hostPort: ");
		result.append(hostPort);
		result.append(", containerPort: ");
		result.append(containerPort);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}

} //ContainerPortImpl
