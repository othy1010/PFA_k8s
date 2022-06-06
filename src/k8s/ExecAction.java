/**
 */
package k8s;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.ExecAction#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getExecAction()
 * @model
 * @generated
 */
public interface ExecAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute list.
	 * @see k8s.K8sPackage#getExecAction_Command()
	 * @model required="true" transient="true"
	 * @generated
	 */
	EList<String> getCommand();

} // ExecAction
